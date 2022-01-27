package com.company.workWithInformation;

import com.company.TextProcessable;

public class ReplaceInformation implements TextProcessable {
    int startReplace;
    int endReplace;
    Object replacement;

    public ReplaceInformation(int startReplace,int endReplace,Object replacement) {
        this.startReplace = startReplace;
        this.endReplace = endReplace;
        this.replacement = replacement;
    }
    @Override
    public void process(StringBuilder strB) {
        strB.replace(startReplace,endReplace, String.valueOf(replacement));
    }
}
