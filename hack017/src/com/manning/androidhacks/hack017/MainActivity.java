/*******************************************************************************
 * Copyright (c) 2012 Manning
 * See the file license.txt for copying permission.
 ******************************************************************************/
package com.manning.androidhacks.hack017;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
  }

  public void OnWizardStart(View v) {
    startActivity(new Intent(this, CreateAccountActivity.class));
  }
}
