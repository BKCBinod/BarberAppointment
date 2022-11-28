package com.cg.servises;

import java.util.List;

import com.cg.model.Cart;
import com.cg.model.Userr;

public interface UserrServiceIf {
    public Userr SaveUserDetails(Userr user);
    public Userr fetchUserByemailIdAndPassword(Userr user);
    public Userr fetchById(int id);



}
