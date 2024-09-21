// linuxMain/kotlin/Main.kt
import gtk3.*

fun main() {
    gtk_init(null, null)
    val window = gtk_window_new(GtkWindowType.GTK_WINDOW_TOPLEVEL)!!
    gtk_window_set_title(window.reinterpret(), "Hello, Linux Desktop!")
    gtk_window_set_default_size(window.reinterpret(), 400, 300)
    gtk_widget_show_all(window)
    gtk_main()
}
