# CampusLife

CampusLife is the Android companion app built for **COMPX202/Y05853 – Assignment One**.
It presents the four University of Waikato student service areas (Facilities, Events,
Clubs and Support) in a layout that adapts to portrait, landscape and any screen size.

## Project set-up

| Setting | Value |
| --- | --- |
| Language | Java |
| Minimum SDK | API 24 (Android 7.0 Nougat) |
| Compile / target SDK | 37 |
| Android Gradle Plugin | 9.3.3 with Gradle 9.6.0 |

Open the project in Android Studio and run it on a device or an emulator, or build it
from the command line:

```bash
./gradlew :app:assembleDebug     # build app/build/outputs/apk/debug/app-debug.apk
./gradlew :app:installDebug      # install on a connected device
```

## How the app is structured

* `MainActivity` – the home screen. It shows the banner and the four image buttons and
  starts `DetailActivity` with an explicit Intent.
* `DetailActivity` – the detail screen. It reads the topic index from the Intent and
  fills the header and the body with the data stored in `res/values/arrays.xml`.
* `res/layout/activity_main.xml` – portrait home screen (banner plus a two-by-two grid).
* `res/layout-land/activity_main.xml` – landscape home screen: the same layout with the
  four buttons in a single row.
* `res/layout/activity_detail.xml` – header (photo, icon, name) plus a scrollable body.
* `res/drawable/button_selector.xml` – green at rest, light green while pressed.

## Assignment parts

| Part | Where it lives |
| --- | --- |
| A – project and Git | whole repository |
| B – Android XML | `res/layout/activity_main.xml` |
| C – Android resources | `res/values/colors.xml`, `res/drawable/button_selector.xml`, `res/mipmap-*`, `res/values/strings.xml` |
| D – orientation | `res/layout-land/activity_main.xml` |
| E – onClick events | `android:onClick` in both home layouts, handlers in `MainActivity` |
| F – new activity | `DetailActivity`, `res/layout/activity_detail.xml` |
| G – explicit Intent | `MainActivity.openDetail(...)` and `DetailActivity.EXTRA_TOPIC_INDEX` |
| H – UI from Java | `DetailActivity.populateFromResources(...)` with `res/values/arrays.xml` |
| I – code quality | comments and structure across the project |

No layout uses a hard-coded size: widths and heights come from `match_parent`,
`wrap_content`, `layout_weight` or the image aspect ratio, and every spacing value is
declared in `res/values/dimens.xml`. The only fixed text size is the 40sp banner title,
as allowed by the specification.
