package com.mycompany.tp5ex1;


public interface MachineLearningModel {
    void train(Dataset sataset) ;
    void predict(Dataset dataset);   
}