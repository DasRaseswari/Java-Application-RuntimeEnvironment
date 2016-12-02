/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.organization.accounting.Accounting;
import business.organization.groupclasses.GroupClassesDirectory;
import business.organization.membership.MembershipDirectory;
import business.organization.specialservice.SpecialServiceDirectory;
import business.organization.vendor.Vendor;
import business.organization.message.MessageDirectory;

/**
 *
 * @author Skull
 */
public class OrganizationDirectory {
    
    private MembershipDirectory membershipDirectory;
    private MessageDirectory workOrderDirectory;
    private GroupClassesDirectory groupClassesDirectory;
    private SpecialServiceDirectory sevicesDirectory;
    private Vendor vendor;
    private Accounting accounting;

    public MembershipDirectory getMembershipDirectory() {
        return membershipDirectory;
    }

    public void setMembershipDirectory(MembershipDirectory membershipDirectory) {
        this.membershipDirectory = membershipDirectory;
    }

    public MessageDirectory getWorkOrderDirectory() {
        return workOrderDirectory;
    }

    public void setWorkOrderDirectory(MessageDirectory workOrderDirectory) {
        this.workOrderDirectory = workOrderDirectory;
    }

    public GroupClassesDirectory getGroupClassesDirectory() {
        return groupClassesDirectory;
    }

    public void setGroupClassesDirectory(GroupClassesDirectory groupClassesDirectory) {
        this.groupClassesDirectory = groupClassesDirectory;
    }

    public SpecialServiceDirectory getSevicesDirectory() {
        return sevicesDirectory;
    }

    public void setSevicesDirectory(SpecialServiceDirectory sevicesDirectory) {
        this.sevicesDirectory = sevicesDirectory;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Accounting getAccounting() {
        return accounting;
    }

    public void setAccounting(Accounting accounting) {
        this.accounting = accounting;
    }
    
}
