package com.rhinoda.marina.rhinoda_test_tast.model;

public class Group implements IGroup {

    private String groupName;
    private int membersNumber;

    public Group(String groupName, int membersNumber) {
        this.groupName = groupName;
        this.membersNumber = membersNumber;
    }

    @Override
    public String getGroupName() {
        return groupName;
    }

    @Override
    public int getMembersNumber() {return membersNumber;}
}
