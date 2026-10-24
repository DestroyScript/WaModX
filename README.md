<div align="center">

<picture>
  <source media="(prefers-color-scheme: dark)" srcset="./assets/brand/title_dark.png">
  <source media="(prefers-color-scheme: light)" srcset="./assets/brand/title_light.png">
  <img src="./assets/brand/title_light.png" width="300" alt="WaModX">
</picture>

<br>

<picture>
  <source media="(prefers-color-scheme: dark)" srcset="./assets/brand/stars_dark.png">
  <source media="(prefers-color-scheme: light)" srcset="./assets/brand/stars_light.png">
  <img src="./assets/brand/stars_light.png" height="24" alt="An unofficial WhatsApp mod built against stubs.">
</picture>

<br>
<br>

<p>
  <img src="https://img.shields.io/badge/2.26.36.70-25D366?style=flat-square&logo=whatsapp&logoColor=white">
  &nbsp;
  <img src="https://img.shields.io/badge/Unofficial-1a1a1a?style=flat-square">
  <br>
  <img src="https://img.shields.io/badge/license%20%7C%20MIT-1a1a1a?style=flat-square">
</p>

</div>

<p align="center">
  <b>WaModX</b> is an <b>unofficial WhatsApp mod</b> shipped as a <b>standalone APK</b>
  built against hand-written stubs — never against WhatsApp's real classes.
</p>

<p align="center"><b>Requirements</b></p>

<p align="left">
<img src="./assets/icons/gear.svg" width="16" alt=""> <b>Apktool</b> <code>3.0.2</code><br>
<img src="./assets/icons/coffee.svg" width="16" alt=""> <b>JDK</b> <code>17+</code><br>
<img src="./assets/icons/android.svg" width="16" alt=""> <b>Android SDK</b> build-tools (<code>zipalign</code>, <code>apksigner</code>)<br>
<img src="./assets/icons/phone.svg" width="16" alt=""> <b>WhatsApp</b> <code>2.26.36.70</code>
</p>

<picture>
  <source media="(prefers-color-scheme: dark)" srcset="./assets/headings/features_dark.png">
  <source media="(prefers-color-scheme: light)" srcset="./assets/headings/features_light.png">
  <img src="./assets/headings/features_light.png" height="34" alt="Features">
</picture>

<br>

<p>
<img src="./assets/icons/check-done.svg" width="18" alt="done"> <b>Anti Revoke Status</b><br>
<img src="./assets/icons/check-done.svg" width="18" alt="done"> <b>Anti Revoke Messages</b><br>
<img src="./assets/icons/check-done.svg" width="18" alt="done"> <b>Freeze Last Seen</b><br>
<img src="./assets/icons/check-done.svg" width="18" alt="done"> <b>Hide Status View</b><br>
<img src="./assets/icons/check-done.svg" width="18" alt="done"> <b>Hide Blue Ticks</b><br>
<img src="./assets/icons/check-done.svg" width="18" alt="done"> <b>Blue Ticks After Reply</b><br>
<img src="./assets/icons/check-done.svg" width="18" alt="done"> <b>Hide Typing / Recording Audio</b><br>
<img src="./assets/icons/check-done.svg" width="18" alt="done"> <b>Download Status / Copy Status Text</b><br>
<img src="./assets/icons/check-done.svg" width="18" alt="done"> <b>Fix SMS</b><br>
<img src="./assets/icons/check-orange.svg" width="18" alt="partial"> <b>Bypass Anti Ban</b><br>
<img src="./assets/icons/check-pending.svg" width="18" alt="pending"> <b>Anti View Once</b><br>
<img src="./assets/icons/check-pending.svg" width="18" alt="pending"> <b>Design Mods</b>
</p>

<br>

<picture>
  <source media="(prefers-color-scheme: dark)" srcset="./assets/headings/map_dark.png">
  <source media="(prefers-color-scheme: light)" srcset="./assets/headings/map_light.png">
  <img src="./assets/headings/map_light.png" height="34" alt="Map">
</picture>

<br>

<p>Where each hook lands in the host, one <code>invoke-static</code> per call site.</p>

<p align="left">
<img src="./assets/icons/freeze.svg" width="16" alt=""> <b>Freeze Last Seen</b> → <code>LX/17Q.A00</code>, <code>LX/1cv.A00</code><br>
<img src="./assets/icons/ticks.svg" width="16" alt=""> <b>Hide Blue Ticks</b> → <code>LX/18p.A0O</code>, <code>LX/18p.A0Y</code><br>
<img src="./assets/icons/reply.svg" width="16" alt=""> <b>Blue Ticks After Reply</b> → <code>SendE2EMessageJob.A0G</code><br>
<img src="./assets/icons/hourglass.svg" width="16" alt=""> <b>Read Receipt Job</b> → <code>SendReadReceiptJob.A0G</code><br>
<img src="./assets/icons/undo.svg" width="16" alt=""> <b>Anti Revoke Messages</b> → <code>LX/1DU.A00</code>, <code>LX/BOY.getDateView</code><br>
<img src="./assets/icons/mic.svg" width="16" alt=""> <b>Hide Typing / Recording</b> → <code>LX/1im.CCQ</code>, <code>LX/6nE.A01</code><br>
<img src="./assets/icons/status.svg" width="16" alt=""> <b>Status Actions</b> → <code>StatusPlaybackContactFragment.A0K</code><br>
<img src="./assets/icons/sliders.svg" width="16" alt=""> <b>Settings Entry</b> → <code>SettingsTabActivity.onResume</code><br>
<img src="./assets/icons/android.svg" width="16" alt=""> <b>Fix SMS / Bypass Anti Ban</b> → <code>LX/1Nw.A08</code>, <code>LX/02X.A00</code>, <code>GooglePlayServicesUtil.A01</code>, <code>LX/H4u.A00</code>, <code>LX/00L.A01</code>, <code>LX/HfK.A01</code>
</p>

<br>

<picture>
  <source media="(prefers-color-scheme: dark)" srcset="./assets/headings/contributing_dark.png">
  <source media="(prefers-color-scheme: light)" srcset="./assets/headings/contributing_light.png">
  <img src="./assets/headings/contributing_light.png" height="34" alt="Contributing">
</picture>

<br>

The most useful PR you can send is a stub that stopped matching after a
WhatsApp update. One concern per PR keeps it reviewable, and easy to
revert on its own if it turns out to be wrong.

<p align="left">
<img src="./assets/icons/fork.svg" width="16" alt=""> <b>Fork</b> your own copy (<a href="https://github.com/SoughtXp/WaModX/fork">fork this repo</a>)<br>
<img src="./assets/icons/branch.svg" width="16" alt=""> <b>Branch</b> one per change<br>
<img src="./assets/icons/commit.svg" width="16" alt=""> <b>Commit</b> one concern per commit<br>
<img src="./assets/icons/push.svg" width="16" alt=""> <b>Push</b> to your fork<br>
<img src="./assets/icons/pull-request.svg" width="16" alt=""> <b>Pull Request</b> against <code>main</code> (<a href="../../pulls">open a PR</a>)
</p>

<br>

<picture>
  <source media="(prefers-color-scheme: dark)" srcset="./assets/headings/license_dark.png">
  <source media="(prefers-color-scheme: light)" srcset="./assets/headings/license_light.png">
  <img src="./assets/headings/license_light.png" height="34" alt="License">
</picture>

<p>Released under the <a href="./LICENSE"><b>MIT License</b></a>.</p>
