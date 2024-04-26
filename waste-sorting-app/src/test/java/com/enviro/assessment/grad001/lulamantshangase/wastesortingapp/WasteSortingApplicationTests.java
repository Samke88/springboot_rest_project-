package com.enviro.assessment.grad001.lulamantshangase.wastesortingapp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.model.DisposalGuideline;
import com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.model.RecyclingTip;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = WasteSortingApplication.class)
class WasteSortingApplicationTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;
    // private final RestTemplate restTemplate = new RestTemplate();
    // private final int port = 8083; // Change this to your actual port number


    @SuppressWarnings("unused")
    private RecyclingTip recyclingTipService;
    

    @Test
    void contextLoads() {
        assertThat(restTemplate).isNotNull();
    }


    @Test
    void testHomePage() {
        ResponseEntity<String> response = this.restTemplate.getForEntity("http://localhost:" + port + "/", String.class);
        assertThat(response.getBody()).isEqualTo("Welcome to Waste Sorting Application");
    }


    @SuppressWarnings("null")
    @Test
    void testGetRecyclingTipByWasteCategory() {
        ResponseEntity<RecyclingTip> responseEntity = restTemplate.getForEntity("http://localhost:" + port + "/recycling-tip?wasteCategory=Plastic", RecyclingTip.class);
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        RecyclingTip response = responseEntity.getBody();
        assertThat(response).isNotNull();
        assertThat(response.getWasteCategory()).isEqualTo("Plastic");
    }
    

    @Test
    void testGetDisposalGuidelineByWasteCategory() {
        DisposalGuideline guideline = this.restTemplate.getForObject("http://localhost:" + port + "/disposalguideline/Plastic", DisposalGuideline.class);
        assertThat(guideline).isNotNull();
        assertThat(guideline.getWasteCategory()).isEqualTo("Plastic");
    }

    @Test
    void testInvalidRequest() {
        ResponseEntity<String> response = this.restTemplate.getForEntity("http://localhost:" + port + "/invalid-endpoint", String.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
    }

    
}


