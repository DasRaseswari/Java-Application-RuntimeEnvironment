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
import userinterface.marketingrole.MarketingProfileJPanel;
import userinterface.marketingrole.MarketingRoleWorkAreaJPanel;

/**
 *
 * @author raseswaridas
 */
public class MarketingRole extends Role {
    
    public void setSalary(){
        salary = 1200;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, Business business){
        return new MarketingRoleWorkAreaJPanel(userProcessContainer, userAccount, business);
    }
    
    @Override
    public JPanel createProfile(JPanel userProcessContainer, UserAccount userAccount, Accounting accounting, Business business){
        return new MarketingProfileJPanel(userProcessContainer, userAccount, accounting, business);
    }
    
    @Override
    public RoleType getRoleType(){
        return Role.RoleType.Marketing;
    }
    
}
