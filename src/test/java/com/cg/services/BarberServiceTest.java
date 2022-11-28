package com.cg.services;




import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cg.model.Barber;
import com.cg.model.Userr;
import com.cg.repository.BarberRepository;
import com.cg.repository.CartRepo;
import com.cg.repository.UserrRepo;
import com.cg.servises.BarberService;
import com.cg.servises.UserrService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ContextConfiguration(classes = {UserrService.class})
@ExtendWith(MockitoExtension.class)
class BarberServiceTest {

	@InjectMocks
    BarberService service;
      
    @Mock
    BarberRepository dao;
     
    @Test
    public void testFindAllBarber()
    {
        List<Barber> list = new ArrayList<Barber>();
        Barber empOne = new Barber(1, "John","haircut","available",5,300);
        Barber empTwo = new Barber(1, "max","haircut","available",5,301);
        Barber empThree = new Barber(1, "sai","haircut","available",6,300);
          
        list.add(empOne);
        list.add(empTwo);
        list.add(empThree);
          
        when(dao.findAll()).thenReturn(list);
          
        //test
        List<Barber> empList = service.viewAllBarbers();
          
        assertEquals(3, empList.size());
        verify(dao, times(1)).findAll();
    }
    @Test
    public void testCreateOrSaveBarber()
    {
    	Barber barber = new Barber(1, "John","haircut","available",5,300);
          
        service.resister(barber);
          
        verify(dao, times(1)).save(barber);
    }
    @Test
    void isBarberExitsById() {
    	Barber barber = new Barber(1, "John","haircut","available",5,300);
        dao.save(barber);
       
        Barber b= service.viewABarbersById(1);
        Boolean actualResult=b.getName().equals(barber.getName());
        assertThat(actualResult).isTrue();
    }


    @Test
    void should_delete_one_Barber() {
     service.deleteBarberById(1);
     verify(dao,times(1)).deleteById(1);
        
    }
}

