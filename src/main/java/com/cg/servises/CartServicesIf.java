package com.cg.servises;

import java.util.List;

import com.cg.model.BarberServiceList;

public interface CartServicesIf{


    public List<BarberServiceList> fetchCartDetails(String email);

    public String deleteItemFromCart(int cartId , String useremail);
}
