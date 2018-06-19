package org.primefaces.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "testView")
public class TestView implements Serializable {
    
    private String testString;
    private String testInputStandard;
    private String testInputCustom;
    private String testInputCustomHolder;
    private String testInputCustomHolderWithComposite;
    private List<InputsModel> testInputList = new ArrayList<>();
    
    @PostConstruct
    public void init() {
        testString = "Welcome to PrimeFaces!!!";
        for (int i=0; i<10 ; i++) {
            InputsModel inputsModel = new InputsModel();
            inputsModel.setTestString("Repeat " + i);
            testInputList.add(inputsModel);
        }
    }

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }

    public String getTestInputStandard() {
        return testInputStandard;
    }

    public void setTestInputStandard(String testInputStandard) {
        this.testInputStandard = testInputStandard;
    }

    public String getTestInputCustom() {
        return testInputCustom;
    }

    public void setTestInputCustom(String testInputCustom) {
        this.testInputCustom = testInputCustom;
    }

    public String getTestInputCustomHolder() {
        return testInputCustomHolder;
    }

    public void setTestInputCustomHolder(String testInputCustomHolder) {
        this.testInputCustomHolder = testInputCustomHolder;
    }

    public String getTestInputCustomHolderWithComposite() {
        return testInputCustomHolderWithComposite;
    }

    public void setTestInputCustomHolderWithComposite(String testInputCustomHolderWithComposite) {
        this.testInputCustomHolderWithComposite = testInputCustomHolderWithComposite;
    }

    public List<InputsModel> getTestInputList() {
        return testInputList;
    }

    public void setTestInputList(List<InputsModel> testInputList) {
        this.testInputList = testInputList;
    }
}
