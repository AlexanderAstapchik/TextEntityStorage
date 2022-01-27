package com.company.workWithInformation;

import com.company.TextProcessable;

public class AppendInformation implements TextProcessable {
    Object endObject;

    public AppendInformation(Object endObject) {
        this.endObject = endObject;
    }

    @Override
    public void process(StringBuilder strB) {
        strB.append(endObject);
    }
}
