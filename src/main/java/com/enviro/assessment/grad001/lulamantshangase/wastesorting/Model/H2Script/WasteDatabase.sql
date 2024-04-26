CREATE TABLE IF NOT EXISTS WasteCategory (
    id INT AUTO_INCREMENT PRIMARY KEY,
    categoryName VARCHAR(50) NOT NULL,
    disposalGuide VARCHAR(200) NOT NULL,
    recyclingTips VARCHAR(200) NOT NULL,

);

INSERT INTO WasteCategories(categoryName, disposalGuide, recyclingTips) Values ('Liquid Waste','https://www.vlses.com/2022/10/03/7-common-liquid-waste-disposal-methods/','');
INSERT INTO WasteCategories(categoryName, disposalGuide, recyclingTips) Values ('Solid Waste','https://www.dhs.gov.za/sites/default/files/u16/REDBOOK_Section_M_SolidWaste_v1.pdf','');
INSERT INTO WasteCategories(categoryName, disposalGuide, recyclingTips) Values ('Organic Waste','','https://www.iwmsa.co.za/resources/faq-food-waste');
INSERT INTO WasteCategories(categoryName, disposalGuide, recyclingTips) Values ('Hazardous Waste','https://resource.capetown.gov.za/documentcentre/Documents/Procedures%2C%20guidelines%20and%20regulations/Disposal%20Guide%20for%20Chemical%20or%20Manufactured%20Waste%20and%20E-waste.pdf','');
