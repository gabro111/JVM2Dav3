package ge.btu.nika.gabrichidze.service;

import ge.btu.nika.gabrichidze.model.Covid;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;




@WebService
public class CovidService {


    @WebMethod
    public List<Covid> getStatistic(){
        List<Covid> covidList=new ArrayList<Covid>();
        covidList.add(new Covid("saqartvelo",10000,222,9300));
        covidList.add(new Covid("azerbaijan",22213,444,11111));
        covidList.add(new Covid("russia",1231232,111121,444214));

        return covidList;
    }


    @WebMethod
    public Covid CountryStatistic(String Country){
        List<Covid> covidList=new ArrayList<Covid>();
        covidList.add(new Covid("saqartvelo",10000,222,9300));
        covidList.add(new Covid("azerbaijan",22213,444,11111));
        covidList.add(new Covid("russia",1231232,111121,444214));

        for (Covid covid:covidList) {
            if(Country.equals(covid.getCountry())){
                return covid;
            }

        }
        return new Covid("NotInList",0,0,0);

    }
    @WebMethod
    public int TotalConfirmed(){
        List<Covid> covidList=new ArrayList<Covid>();
        covidList.add(new Covid("saqartvelo",10000,222,9300));
        covidList.add(new Covid("azerbaijan",22213,444,11111));
        covidList.add(new Covid("russia",1231232,111121,444214));

        int total =0;

        for (Covid covid:covidList){
            total += covid.getConfirmed();
        }

        return total;
    }
    @WebMethod
    public int TotalDeathget(){
        List<Covid> covidList=new ArrayList<Covid>();
        covidList.add(new Covid("saqartvelo",10000,222,9300));
        covidList.add(new Covid("azerbaijan",22213,444,11111));
        covidList.add(new Covid("russia",1231232,111121,444214));

        int total =0;

        for (Covid covid:covidList){
            total += covid.getDeaths();
        }

        return total;
    }
    public int TotalRecoveryget(){
        List<Covid> covidList=new ArrayList<Covid>();
        covidList.add(new Covid("saqartvelo",10000,222,9300));
        covidList.add(new Covid("azerbaijan",22213,444,11111));
        covidList.add(new Covid("russia",1231232,111121,444214));

        int total =0;

        for (Covid covid:covidList){
            total += covid.getRecovered();
        }

        return total;
    }
}
