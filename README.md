<h1 align="center">
  <br>
  <a href=""><img src="https://raw.githubusercontent.com/Rafee-M/TheYoungWitcher/main/docs/images/logo/logo-banner small.png" crossorigin></a>
</h1>

<h4 align="center"> A medival text based RPG game built with Java and ❤</h4>

<div align="center">
  
[![forthebadge](https://forthebadge.com/images/badges/made-with-java.svg)](https://github.com/Rafee-M/TheYoungWitcher)
[<img src= "docs/images/logo/get-it-on-github(1).png" alt="Download from GitHub" height="38">](https://github.com/Rafee-M/TheStolen/releases/tag/v0.0.1)

   [![Visits](https://img.shields.io/badge/dynamic/json?url=https%3A%2F%2Fhits.dwyl.com%2FRafee-M%2FTheYoungWitcher.json&query=%24.message&style=flat&logo=github&label=visits&color=brightgreen)]()
   [![Last Commit](https://img.shields.io/github/last-commit/Rafee-M/TheYoungWitcher.svg?style=flat&logo=github&logoColor=white)](https://github.com/Rafee-M/TheYoungWitcher/commits/main)
   [![Issue](https://img.shields.io/github/issues-raw/Rafee-M/TheYoungWitcher.svg?style=flat&logo=github&logoColor=white)](https://github.com/Rafee-M/TheYoungWitcher/issues)
   [![Pull Requests](https://img.shields.io/github/issues-pr-raw/Rafee-M/TheYoungWitcher.svg?style=flat&logo=github&logoColor=white)](https://github.com/Rafee-M/TheYoungWitcher/pulls)
</p>

<p align="center">
  <a href="#features">Features</a>
  <a href="#roadmap">Roadmap</a>
  <a href="#choice-implementation">Choice-Implementation</a>
</p>

</div>

---

<table>
<tr>
<td>
  
**The Stolen** is a text-based RPG game based in the 12th century. It implements various aspects of Object Oriented Programming such as encapsulation and abstraction, and delivers a game with modern UI, multiple scenarios and endings, advanced game mechanics, and much more.

It is part of a university course project, so outside pull requests aren't needed. But feel free to open issues regarding bugs and feature requests!

![The Stolen](https://raw.githubusercontent.com/Rafee-M/TheYoungWitcher/main/docs/images/logo/code-preview.png)
<p align="right">
<sub>(Preview)</sub>
</p>

</td>
</tr>
</table>


## Features
- Customizable player names
- Customizable font size
- Game saving and loading
- RNG (Random Number Generation) for various player choices
- Each user choice has relevant impacts
- Foundation of the story
   - **Background:** In the medieval era, darkness descends upon villages, swallowing them whole without a trace. As a young adult residing in one such village, you witness the unexplained vanishings firsthand. When your own family succumbs to the mysterious fate, leaving you bereft and alone, you resolve to unravel the enigma. With courage as your armor, you venture into the dense, foreboding forest that harbors secrets darker than the night itself, determined to uncover the truth and rescue your loved ones from the clutches of the unknown.
 
#### Screenshots:
 | <img src="docs/images/screenshots/StartingScreen.png" width="350"/> | <img src="docs/images/screenshots/MainScreen.png" width="350"/> | <img src="docs/images/screenshots/SettingsPanel.png" width="350"/> |
| :--: | :--: | :--: |
|Start Screen|Main Screen|Settings Panel|

## Roadmap:
- ~Addition of more classes: monster, story choice levels, etc~
- ~Add implementation for other applicable classes in RNG class~
- ~Add choices and subsequent story pathways to chose choices~
- Prepare a combat system
- Design levels which would be set in: swamps, caves, etc
- ~Build a minimalistic GUI with intuitive user interface and font size customisation for better accessibility~

## Choice Implementation:
- A choice tree has been constructed for visualising the connection between choices and outcomes
- Each major choice will be divided into separate classes. Example: first 3 major choices will be in `One` class and they will give connect to respective choices in `Two` class
  
| <img src="docs/images/info/Choice-Map.png" width="400"/> |
| :--: |
|Choice Map|
