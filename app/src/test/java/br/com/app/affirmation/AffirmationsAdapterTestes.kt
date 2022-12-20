package br.com.app.affirmation

import br.com.app.affirmation.adapter.ItemAdapter
import br.com.app.affirmation.model.Affirmation
import org.junit.Test
import org.mockito.Mockito.mock

import org.junit.Assert.*
import org.junit.runner.manipulation.Ordering

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class AffirmationsAdapterTests {

    private val context = mock(Ordering.Context::class.java)

    @Test
    fun adapter_size() {
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )
        val adapter = ItemAdapter(context, data)
        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
    }
}