package nlister.vocs.lio.ui.list.main

import nlister.vocs.lio.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class ListMainFragment : BaseFragment(), ListMainView {

    val mProfileViewModel: ListMainViewModel by viewModel()

    companion object {
        fun newInstance() = ListMainFragment()
    }

}