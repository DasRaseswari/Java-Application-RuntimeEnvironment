/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.Business;
import business.enterprise.Enterprise;
import business.organization.accounting.Accounting;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.regulartrainerrole.RegularTrainerProfileJPanel;
import userinterface.regulartrainerrole.RegularTrainerRoleWorkAreaJPanel;

/**
 *
 * @author raseswaridas
 */
public class RegularTrainerRole extends Role {
    
    public void setSalary(){
        salary = 1800;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, Business business){
        return new RegularTrainerRoleWorkAreaJPanel(userProcessContainer, userAccount, enterprise, business);
    }
    
        @Override
    public JPanel createProfile(JPanel userProcessContainer, UserAccount userAccount, Accounting accounting, Business business){
        return new RegularTrainerProfileJPanel(userProcessContainer, userAccount, accounting, business);
    }
    
    @Override
    public RoleType getRoleType(){
        return Role.RoleType.RegularTrainer;
    }
    
}
