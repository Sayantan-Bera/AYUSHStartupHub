package adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.ayushstartuphub.Fragments.InvestorFragment
import com.example.ayushstartuphub.Fragments.MentorFragment
import com.example.ayushstartuphub.Fragments.StartupFragment

class TabsAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle):FragmentStateAdapter(fragmentManager, lifecycle){
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0->return StartupFragment()
            1->return InvestorFragment()
            2->return MentorFragment()
            else->return StartupFragment()
        }
    }
}