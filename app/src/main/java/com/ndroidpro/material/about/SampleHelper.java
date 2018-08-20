package com.ndroidpro.material.about;


import android.app.Activity;
import android.content.Intent;
import android.widget.FrameLayout;

import com.ndroidpro.material.R;
import com.ndroidpro.material.about.builder.AboutBuilder;
import com.ndroidpro.material.about.views.AboutView;

/**
 * Created by jrvansuita on 17/02/17.
 */
public class SampleHelper {

    private Activity activity;
    private int theme = R.style.MyProfileTheme;

    private SampleHelper(Activity activity) {
        this.activity = activity;
    }

    public static SampleHelper with(Activity activity) {
        return new SampleHelper(activity);
    }

    public SampleHelper init() {
        activity.setTheme(theme);
        return this;
    }

    private void findViews() {

    }

    public void loadAbout() {

        findViews();

        final FrameLayout flHolder = activity.findViewById(R.id.about);

        AboutBuilder builder = AboutBuilder.with(activity)
                .setAppIcon(R.mipmap.ic_launcher)
                .setAppName(R.string.app_name)
                .setPhoto(R.mipmap.nikhil_profile)
                .setCover(R.mipmap.profile_nikhil_cover)
                .setLinksAnimated(true)
                .setDividerDashGap(13)
                .setName("Nikhil Vashistha")
                .setSubTitle("Senior Android Developer")
                .setLinksColumnsCount(4)
                .setBrief("I'm warmed of mobile technologies. Ideas maker, curious and nature lover.")
                .addGooglePlayStoreLink("8002078663318221363")
                .addGitHubLink("NikhilVashistha")
                .addBitbucketLink("jrvansuita")
                .addFacebookLink("nikhil.vashistha")
                .addTwitterLink("nikhil200816")
                .addInstagramLink("jnrvans")
                .addGooglePlusLink("+JuniorVansuita")
                .addYoutubeChannelLink("CaseyNeistat")
                .addDribbbleLink("user")
                .addLinkedInLink("vashisthanikhil")
                .addEmailLink("vh9s@ymail.com")
                .addWhatsappLink("Nikhil Vashistha", "+919368234742")
                .addSkypeLink("nikhil200816")
                .addGoogleLink("user")
                .addAndroidLink("user")
                .addWebsiteLink("https://www.ndroidpro.com")
                .addFiveStarsAction()
                .addMoreFromMeAction("Nikhil Vashistha")
                .setVersionNameAsAppSubTitle()
                .addShareAction(R.string.app_name)
                .addUpdateAction()
                .setActionsColumnsCount(2)
                .addFeedbackAction("vh9s@ymail.com")
                .addPrivacyPolicyAction("https://www.ndroidpro.com/privacy-policy")
                .addIntroduceAction((Intent) null)
                .addHelpAction((Intent) null)
                .addChangeLogAction((Intent) null)
                .addRemoveAdsAction((Intent) null)
                .addDonateAction((Intent) null)
                .setWrapScrollView(true)
                .setShowAsCard(true);

        AboutView view = builder.build();

        flHolder.addView(view);
    }

    public void loadNikhilAbout() {

        findViews();

        final FrameLayout flHolder = activity.findViewById(R.id.about);

        AboutBuilder builder = AboutBuilder.with(activity)
                .setAppIcon(R.mipmap.ic_launcher)
                .setAppName(R.string.app_name_profile)
                .setVersionNameAsAppSubTitle()
                .setPhoto(R.mipmap.nikhil_profile)
                .setCover(R.mipmap.profile_nikhil_cover)
                .setLinksAnimated(true)
                .setName("Nikhil Vashistha")
                .setSubTitle("Senior Android Developer")
                .setLinksColumnsCount(4)
                .setBrief("✓ 4+ Years of experience in architecture, design and development of mobile applications using Android Studio, Eclipse, Java, Sqlite, Web services, various OO design pattern.\n" +
                        "✓ B.Tech in Information Technology.\n" +
                        "✓ Excellent knowledge in Mobile Development[Android, Java, Xml, Rest].\n" +
                        "✓ Knowledge of OOP principles, design patterns.\n" +
                        "✓ Agile Software Development.\n" +
                        "✓ Experience in Web service integration.\n" +
                        "✓ Specialties: Android Native Apps, Angular Js\n" +
                        "✓ O/S : Windows\n" +
                        "✓ Mobile O/S : Android\n" +
                        "✓ SDK : Android sdk\n" +
                        "✓ Google: Gcm, Maps, Places API, Material Design , AdMob.\n" +
                        "✓ IDE : Eclipse, Android Studio\n" +
                        "✓ Database : Sqlite, MySQL\n" +
                        "✓ Libraries : Retrofit, Picasso, Butternife, Glide, Volley, Realm, etc\n" +
                        "✓ Design Methodology : Agile\n" +
                        "✓ Experienced in publishing applications on Google Play Store.\n" +
                        "✓ Experienced in integration of social media Api's like Facebook, Google+.\n" +
                        "✓ Experienced in Parse and Firebase Backend.")
                .addGitHubLink("NikhilVashistha")
                .addFacebookLink("nikhil.vashistha")
                .addTwitterLink("nikhil200816")
                .addLinkedInLink("vashisthanikhil")
                .addEmailLink("vh9s@ymail.com")
                .addWhatsappLink("Nikhil Vashistha", "+919368234742")
                .addSkypeLink("nikhil200816")
                .addWebsiteLink("https://www.ndroidpro.com")
                .addMoreFromMeAction("Nikhil Vashistha")
                .addShareAction(R.string.app_name)
                .setActionsColumnsCount(2)
                .addFeedbackAction("vh9s@ymail.com")
                .setWrapScrollView(false)
                .setShowAsCard(true);

        AboutView view = builder.build();

        flHolder.addView(view);
    }
}