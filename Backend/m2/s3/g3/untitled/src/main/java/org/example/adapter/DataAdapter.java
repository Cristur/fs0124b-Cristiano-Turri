package org.example.adapter;

public class DataAdapter extends UserData{
    private Info adaptee;

    public DataAdapter(Info adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void getData(DataSource dataSource){

    }
}
