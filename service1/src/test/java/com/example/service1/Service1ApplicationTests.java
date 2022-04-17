package com.example.service1;

import com.example.service1.domain.User;
import com.example.service1.repository.OneRepository;
import com.example.service1.service.Service1;
import com.example.service1.service.ServiceOneImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class Service1ApplicationTests {

    private Service1 service1;

    @Mock
    private OneRepository oneRepository;

    @BeforeEach
    public void init() {
        service1 = new ServiceOneImpl(oneRepository);
    }

    @Test
    void saveMockTest() {
        //given
        when(oneRepository.save()).thenReturn(new User(1L,"jihuhwan"));
        //when
        User result = service1.save();
        //then
        Assertions.assertThat(result.getUsername()).isEqualTo("jihuhwan");
    }
}
