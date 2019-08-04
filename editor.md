<link type="text/css" rel="stylesheet" href="./css/mark.css">

# VSCode 툴

Visual Studio Code 툴은 Eclipse 처럼 무료이며, 다양한 플러그인을 통해 확장 가능합니다.
MarkDown파일 에디터로 사용하는 것 외에도 다양하게 사용하실 수 있지만 여기에서는 간단히 MarkDown 에디터로써 사용방법에 대해 소개하겠습니다.

## 설치

[VSCode 다운로드 링크](https://code.visualstudio.com/Download)  

아래 사진은 위 **`VSCode 다운로드 링크`** 를 클릭하시면 보이는 화면 입니다.  
본인 **`PC 운영체제`** 에 맞게 선택 하신 후 설치를 진행 하시면 됩니다.

![설치화면](./img/download.png)

## 화면 소개

**`설치 후`** 실행을 하시면 보실 수 있는 **`첫 화면`** 입니다.  
툴에 대해 자세히 알지는 못한 상태이므로 자주 쓰이는 내용만 다루도록 하겠습니다.

![첫화면](./img/main.png)

#### 화면리스트
- Explorer 화면
- Search 화면
- Source Control 화면
- Debug 화면
- Extensions 화면


### Explorer 화면

해당 화면은 작업폴더를 선택하여 작업을 할 수 있는 화면입니다.
**`Open Folder`** 를 선택하여 작업할 폴더를 선택할 수 있으며, **`Open Editors`** 는 현재 열려있는 파일의 목록을 확인 하실 수 있습니다.


#### 작업폴더 지정

-  **`Open Folder`** 버튼을 클릭하여 작업할 폴더를 선택해줍니다.

![Explorer 화면](./img/explorer.png)

-  **`폴더 선택 및 열기`** 를 통해 작업폴더를 지정 할 수 있습니다.

![폴더열기](./img/open_folder.png)

- 파일을 선택하여 **`편집`** 할 수 있습니다.

![파일선택](./img/file_view.png)

#### 작업 시 유용한 기능

- **`빨간박스의 아이콘`** 을 선택하면 **`Preview창`** 이 오른쪽에 나타납니다.

![미리보기창](./img/preview.png)

- **`빨간박스의 아이콘`** 을 선택하면 동일 파일을 **`옆으로 창분할`** 해줍니다.

![창분할옆](./img/split_side.png)

- 탭에서 선택한 파일을 **`드래그`** 를 하여 하단으로 이동시 **`아래로 창분할`** 을 해줍니다.

![창분할아래](./img/split_down.png)

- **`빨간 박스의 아이콘을 클릭`** 하시면 **`파일의 변경사항`** 을 확인 할 수 있습니다.  
**`Source Control화면`** 에서도 동일한 내용을 볼 수 있습니다.

![깃트리로가기](./img/git_tree.png)


### Search 화면
이 화면에서는 폴더(프로젝트)내에 있는 파일들에 대해 문자열을 검색할 수 있으며, 조작을 할 수 있습니다.

- 폴더 내 모든 파일에 대해 입력한 **`문자열을 찾을 수 있으며`** , 대체 할 수 있습니다.

![검색화면](./img/search.png)

- 빨간박스 아이콘에서 각아이콘 순서에 따라 **`전체`** or **`파일단위`** or **`행단위`** 로 **`replace`** 가 가능합니다. 
![검색화면2](./img/search2.png)

### Source Control 화면
기존툴과 마찬가지의 기능들을 합니다. Git을 통해 파일 관리를 할 수 있으며, 원격저장소과 연동하여 원격저장소에 데이터를 관리하고 관리할 수 있습니다.

- **`Stage 영역`** 과 **`Working Directory 영역`** 의 변경 내역들을 볼 수 있으며,
 _**`M:Modify, A:Added, U:Untracked`**_ 를 뜻하는 아이콘으로 상태를 확인 할 수 있습니다.
 **`+`** 아이콘으로 Stage 영역란로 올릴 수 있으며, **`-`** 아이콘으로 Working Drirectory 영역으로 이동시킬 수 있습니다. 
 **`v`** 아이콘인 체크모양은 **`Commit`** 이며, **`Message (Press Cmd Enter to commit)`** 의 입력 란은 **`Commit 메세지 입력란`** 입니다.
 **`•••`** 아이콘은 **`push, pull등 명령어`** 를 사용 할 수 있습니다.

![깃1](./img/git_view.png)

![깃2](./img/git_view2.png)

### Debug 및 Extensions 화면

 빨간박스에서 곤충모양의 아이콘은 **`Debug 화면`** 으로 디버깅이 필요할 시 사용할 수 있습니다. 빨간박스에서 마지막인  네모모양의 화면은 **`Extensions 화면`** 으로 다양한 플러그인을 설치하여 기능을 확장 할 수 있습니다.

![그외화면](./img/etc_view.png)