package com.cg.servises;

import java.util.List;

import com.cg.model.Admin;
import com.cg.model.BarberServiceList;

public interface AdminServiceIf {

    public Admin fetchAdminByEmailId(String email);
    public BarberServiceList addBarberService(BarberServiceList barberServiceList);
    public BarberServiceList updateService(Integer serviceId, BarberServiceList barberServiceList);
    public  String deleteService(int serviceId);
    public List<BarberServiceList> getallServices();
    public Admin fetchUserByemailIdAndPassword(Admin admin);


}
