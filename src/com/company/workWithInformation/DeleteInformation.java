package com.company.workWithInformation;

import com.company.TextProcessable;

public class DeleteInformation implements TextProcessable {
    int startIndex;
    int endIndex;
    public DeleteInformation(int startIndex,int endIndex) {
        this.startIndex=startIndex;
        this.endIndex=endIndex;
    }

    @Override
    public void process(StringBuilder strB) {
        strB.delete(startIndex,endIndex);
    }
}
