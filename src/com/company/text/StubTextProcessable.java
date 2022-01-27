package com.company.text;

import com.company.TextProcessable;

public class StubTextProcessable implements TextProcessable {
    @Override
    public void process(StringBuilder strB) {
        throw new UnsupportedOperationException("deprecated method");
    }
}
