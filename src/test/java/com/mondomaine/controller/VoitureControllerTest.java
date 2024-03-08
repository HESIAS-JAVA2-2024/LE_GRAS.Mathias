package com.mondomaine.controller;

import com.mondomaine.model.Voiture;
import com.mondomaine.service.VoitureService;
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
public class VoitureControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private VoitureService voitureService;

    @Test
    public void testCreerVoiture() throws Exception {
        Voiture voiture = new Voiture("Ma Voiture",123);

        when(voitureService.creerVoiture(voiture)).thenReturn(voiture);

        mockMvc.perform(post("/voitures/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"marque\":\"Ma Voiture\",\"puissance\":123}"))
                .andExpect(status().isOk());
    }
}
