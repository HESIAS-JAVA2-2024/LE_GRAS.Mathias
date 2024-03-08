package com.mondomaine.controller;

import com.mondomaine.model.Garage;
import com.mondomaine.service.GarageService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class GarageControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private GarageService garageService;

    @Test
    public void testAjouterGarage() throws Exception {
        Garage garage = new Garage("Mon Garage", "123 Rue Principale");

        when(garageService.ajouterGarage(garage)).thenReturn(garage);

        mockMvc.perform(post("/garages/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"nom\":\"Mon Garage\",\"adresse\":\"123 Rue Principale\"}"))
                .andExpect(status().isOk());
    }
}
