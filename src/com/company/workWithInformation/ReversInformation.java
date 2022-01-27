package com.company.workWithInformation;

import com.company.TextProcessable;

public class ReversInformation implements TextProcessable {
    public ReversInformation() {
    }

    @Override
    public void process(StringBuilder strB) {
        strB.reverse().toString();
    }
}
