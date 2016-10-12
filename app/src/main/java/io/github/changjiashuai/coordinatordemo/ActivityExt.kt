package io.github.changjiashuai.coordinatordemo

import android.app.Activity
import android.content.Intent
import android.os.Bundle

/**
 * Email: changjiashuai@gmail.com
 *
 * Created by CJS on 2016/10/12 16:06.
 */

inline public fun <reified T:Activity> Activity.navigate(bundle: Bundle? = null){
    val intent = Intent(this, T::class.java)
    if (bundle != null){
        intent.putExtras(bundle)
    }
    startActivity(intent)
}