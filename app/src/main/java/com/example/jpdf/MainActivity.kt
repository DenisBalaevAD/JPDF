package com.example.jpdf

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jpdf.databinding.ActivityMainBinding
import com.pdftron.pdf.config.ToolManagerBuilder
import com.pdftron.pdf.config.ViewerConfig
import com.pdftron.pdf.controls.DocumentActivity


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*val config = ViewerConfig.Builder().openUrlCachePath(this.cacheDir.absolutePath).build()
        val fileLink =
            Uri.parse("file:///android_asset/instruction4.pdf")
        DocumentActivity.openDocument(this, fileLink, config)*/

        val config = ViewerConfig.Builder().openUrlCachePath(this.cacheDir.absolutePath)
            .multiTabEnabled(false)
            .documentEditingEnabled(false)
            .longPressQuickMenuEnabled(false)
            .showPageNumberIndicator(false)
            .showBottomNavBar(false)
            .showThumbnailView(false)
            .showBookmarksView(false)
            .toolbarTitle("My Reader")
            .showSearchView(false)
            .showShareOption(false)
            .showDocumentSettingsOption(false)
            .showAnnotationToolbarOption(false)
            .showOpenFileOption(false)
            .showOpenUrlOption(false)
            .showEditPagesOption(false)
            .showPrintOption(false)
            .showCloseTabOption(false)
            .showAnnotationsList(false)
            .showOutlineList(false)
            .showUserBookmarksList(false)
            .showCloseTabOption(false)
            .openSavedCopyInNewTab(false)
            .showCloseTabOption(false)
            .tabletLayoutEnabled(false)
            .longPressQuickMenuEnabled(false)
            .showEditMenuOption(false)
            .longPressQuickMenuEnabled(false)
            .hidePresetBar(false)
            .showAppBar(false)
            .useSupportActionBar(false)
            .showBottomToolbar(false)
            .build()

        val fileLink = Uri.parse("file:///android_asset/instruction4.pdf")

        val intent = DocumentActivity.IntentBuilder.fromActivityClass(this, DocumentActivity::class.java)
            .withUri(fileLink)
            .usingConfig(config)
            .build()
        startActivity(intent)
    }
}