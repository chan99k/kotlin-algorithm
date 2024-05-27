import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

class Prgr_가장많이받은선물Test(

) {

    @Test
    fun test01() {
        assertThat(
            target.solution(
                arrayOf("muzi", "ryan", "frodo", "neo"),
                arrayOf(
                    "muzi frodo",
                    "muzi frodo",
                    "ryan muzi",
                    "ryan muzi",
                    "ryan muzi",
                    "frodo muzi",
                    "frodo ryan",
                    "neo muzi"
                )
            )
        ).isEqualTo(2)
    }

    @Test
    fun test02() {
        assertThat(
            target.solution(
                arrayOf("joy", "brad", "alessandro", "conan", "david"),
                arrayOf(
                    "alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"
                )
            )
        ).isEqualTo(4)
    }

    @Test
    fun test03() {
        assertThat(
            target.solution(
                arrayOf("a", "b", "c"),
                arrayOf(
                    "a b", "b a", "c a", "a c", "a c", "c a"
                )
            )
        ).isEqualTo(0)
    }
    @Test
    fun test04() {
        assertThat(
            target.solution(
                arrayOf("a", "b", "c"),
                arrayOf(
                    "a b", "b a"
                )
            )
        ).isEqualTo(0)
    }

    companion object {
        private lateinit var target: Prgr_가장많이받은선물

        @JvmStatic
        @BeforeAll
        fun setUp() {
            this.target = Prgr_가장많이받은선물()
        }
    }
}