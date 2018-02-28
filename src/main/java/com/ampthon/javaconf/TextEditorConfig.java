package com.ampthon.javaconf;

import com.ampthon.annotation.SpellChecker;
import com.ampthon.annotation.TextEditor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TextEditorConfig {

    @Bean
    public TextEditor textEditor() {
        return new TextEditor(spellChecker());
    }

    @Bean
    public SpellChecker spellChecker() {
        return new SpellChecker();
    }
}
