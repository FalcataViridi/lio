package nlister.vocs.lio

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initKoin()
        setContentView(R.layout.activity_home)
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
