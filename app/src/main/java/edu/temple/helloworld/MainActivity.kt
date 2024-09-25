import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Declare view properties
    lateinit var displayTextView: TextView
    private lateinit var nameEditText: EditText
    private lateinit var clickMeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views defined in the layout
        displayTextView = findViewById(R.id.displayTextView)
        nameEditText = findViewById(R.id.nameEditText)
        clickMeButton = findViewById(R.id.clickMeButton)

        // Set an OnClickListener for the button
        clickMeButton.setOnClickListener {
            // Check if the EditText is empty
            val name = nameEditText.text.toString().trim()
            if (name.isEmpty()) {
                // Display error message if name is not entered
                nameEditText.error = "Please enter your name"
            } else {
                // Display greeting message if name is entered
                displayTextView.text = "Hello, $name"
            }
        }
    }
}
