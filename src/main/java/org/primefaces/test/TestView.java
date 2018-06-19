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
    private List<InputsBean> testInputList = new ArrayList<InputsBean>();

    @PostConstruct
    public void init() {
        testString = "Primefaces tags and custom CC with required=\"true\"";
        for (int i = 0; i < 3; i++) {
            InputsBean inputsBean = new InputsBean();
            inputsBean.setTestString("Repeat " + i);
            testInputList.add(inputsBean);
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

    public List<InputsBean> getTestInputList() {
        return testInputList;
    }

    public void setTestInputList(List<InputsBean> testInputList) {
        this.testInputList = testInputList;
    }
}
