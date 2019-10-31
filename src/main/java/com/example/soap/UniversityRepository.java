package com.example.soap;


import localhost.university.University;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class UniversityRepository {

    private Map<String, University> universities = new HashMap<>();

    @PostConstruct // run method when class is injected
    private void LoadData(){
        University strath = new University();
        strath.setLocation("Ole Sangale");
        strath.setName("Strathmore University");
        strath.setYearFounded("1968");
        universities.put(strath.getName(), strath);
        universities.put(strath.getLocation(), strath);
        universities.put(strath.getYearFounded(), strath);

        University jkuat = new University();
        jkuat.setLocation("Juja");
        jkuat.setName("JKUAT");
        jkuat.setYearFounded("1956");
        universities.put(jkuat.getName(), jkuat);
        universities.put(jkuat.getLocation(), jkuat);
        universities.put(jkuat.getYearFounded(), jkuat);

        University ku = new University();
        ku.setLocation("Kiambu");
        ku.setName("Kenyatta University");
        ku.setYearFounded("1946");
        universities.put(ku.getName(),ku);
        universities.put(ku.getLocation(),ku);
        universities.put(ku.getYearFounded(),ku);

        University uon = new University();
        ku.setLocation("Westlands");
        ku.setName("University of Nairobi");
        ku.setYearFounded("1938");
        universities.put(ku.getName(),ku);
        universities.put(ku.getLocation(),ku);
        universities.put(ku.getYearFounded(),ku);
    }

    public University getUniversityByName(String name){
        Assert.notNull(name, "Please enter the university name");
        return universities.get(name);
    }

    public List<University> getAll(){
        return new ArrayList<>(universities.values());
    }

    public University getAllAtLocation(String location) {
        Assert.notNull(location, "Please enter the location");
        return universities.get(location);
    }
    public University getAllYearFounded(String yearFounded){
        Assert.notNull(yearFounded, "Please enter the year founded");
        return universities.get(yearFounded);
    }


}
