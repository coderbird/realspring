package com.ampthon.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TextEditor {

//    @Autowired
    private SpellChecker spellChecker;

    @Autowired

    public TextEditor( @Qualifier("spellChecker2") SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor");
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

//    @Autowired
//    public void setSpellChecker(SpellChecker spellChecker) {
//        this.spellChecker = spellChecker;
//    }

    public void spellCheck() {
        this.spellChecker.checkSpelling();
    }
}
