package mx.uady.sensors.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.uady.sensors.model.Data;
import mx.uady.sensors.repository.DataRepository;

@Service
public class DataService {
   
  @Autowired
  private DataRepository dataRepository;

  public List<Data> getData() {
    return dataRepository.findAll();
  }

  public Data crear(Data data) {
    Data dataCrear = new Data();
    dataCrear.setValue(data.getValue());
    dataCrear.setDeviceId(data.getDeviceId());

    return dataRepository.save(dataCrear);
  }

}