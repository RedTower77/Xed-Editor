package com.rk.xededitor // Use the correct package name from your project

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.PDFView
import java.io.File

class PdfViewerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf_viewer)

        val filePath = intent.getStringExtra("FILE_PATH")
        if (filePath != null) {
            val file = File(filePath)
            val pdfView = findViewById<PDFView>(R.id.pdfView)
            
            pdfView.fromFile(file)
                .enableSwipe(true)
                .swipeHorizontal(false)
                .load()
        }
    }
}
