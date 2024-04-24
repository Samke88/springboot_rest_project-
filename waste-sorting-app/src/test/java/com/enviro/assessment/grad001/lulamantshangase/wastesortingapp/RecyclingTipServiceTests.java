package com.enviro.assessment.grad001.lulamantshangase.wastesortingapp;
import static org.mockito.Mockito.*;

import com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.model.RecyclingTip;
import com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.service.RecyclingTipService;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RecyclingTipServiceTests {

    @Test
    void testGetRecyclingTipByExistingWasteCategory() {
        // Arrange
        RecyclingTip expectedTip = new RecyclingTip();
        RecyclingTipService recyclingTipService = mock(RecyclingTipService.class);
        when(recyclingTipService.getRecyclingTipByWasteCategory("Plastic")).thenReturn(expectedTip);

        // Act
        RecyclingTip actualTip = recyclingTipService.getRecyclingTipByWasteCategory("Plastic");

        // Assert
        assertThat(actualTip).isNotNull();
        assertThat(actualTip.getWasteCategory()).isEqualTo(expectedTip.getWasteCategory());
        assertThat(actualTip.getDescription()).isEqualTo(expectedTip.getDescription());
    }

    @Test
    void testGetRecyclingTipByNonExistingWasteCategory() {
        // Arrange
        RecyclingTipService recyclingTipService = mock(RecyclingTipService.class);
        when(recyclingTipService.getRecyclingTipByWasteCategory("NonExistingCategory")).thenReturn(null);

        // Act
        RecyclingTip actualTip = recyclingTipService.getRecyclingTipByWasteCategory("NonExistingCategory");

        // Assert
        assertThat(actualTip).isNull();
    }
}
