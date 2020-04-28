package nlister.vocs.lio.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import nlister.vocs.lio.R
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home_layout)
        initKoin()
        //TODO: fragments factory or launcher
    }

    private fun initKoin() {
        val myModule = module {
            //viewModel {
            //TODO: _ViewModel
            //}
            single {
                //TODO: _Repository
            }
        }
        // start Koin!
        startKoin {
            androidContext(applicationContext)
            modules(myModule)
        }
    }

}
