package com.cys.di.construct;

/**
 * @author Alex
 * @date 2023/07/23
 */
public class TextEditor {

    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor.");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}