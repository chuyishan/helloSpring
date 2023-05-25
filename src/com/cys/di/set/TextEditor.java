package com.cys.di.set;

public class TextEditor {
	   private SpellChecker spellChecker;

	   // ����ע��������� setter ������
	   public void setSpellChecker(SpellChecker spellChecker) {
	      System.out.println("Inside setSpellChecker." );
	      this.spellChecker = spellChecker;
	   }
	   // һ������ spellChecker �� getter ����
	   public SpellChecker getSpellChecker() {
	      return spellChecker;
	   }
	   public void spellCheck() {
	      spellChecker.checkSpelling();
	   }
	}