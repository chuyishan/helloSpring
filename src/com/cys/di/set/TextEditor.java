package com.cys.di.set;

public class TextEditor {
	   private SpellChecker spellChecker;

	   // 用于注入依赖项的 setter 方法。
	   public void setSpellChecker(SpellChecker spellChecker) {
	      System.out.println("Inside setSpellChecker." );
	      this.spellChecker = spellChecker;
	   }
	   // 一个返回 spellChecker 的 getter 方法
	   public SpellChecker getSpellChecker() {
	      return spellChecker;
	   }
	   public void spellCheck() {
	      spellChecker.checkSpelling();
	   }
	}