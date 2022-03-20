### Abstracut Factoryクラス
- 関連したり依存し合うオブジェクト群のインスタンスを生成することができる。
- 別名「Kit」とも呼ばれる。


1. 利用シーン・メリット<br>
   - Abstract Factoryパターンは以下のような場合に利用する。<br>
   - Product（部品）が複数存在する場合<br>
   - Product（部品）が拡張する可能性がある場合<br>
   - 実行環境（OS、DB、プラットフォーム、バージョンなど）に追加や変更が生じる場合<br>


2. 注意点、問題点<br>

   - OsSoundSystemという音響システムの部品を追加しようとした場合、 AbstractFactorクラスにcreateSoundメソッドを追加する必要がある。<br>
   つまり、サブクラス全てにcreateSoundメソッドを追加するということである。<br>
   そのため、生成する部品についてもあらかじめ網羅しておくと、後々の保守が楽になる。<br>


3. 他のパターンとの関連<br>
 
    a. Singletonパターン<br>
      - ConCreate Factoryクラスは通常、1つだけ生成すれば良いため、Singletonパターンが利用されることがある。<br>

    b. Prototypeパターン<br>
      - ConcreateProductクラスを生成する際に、Propertyパターンでインスタンスを生成する必要がある。<br>

    c. Factory Methodパターン<br>
      - ConCreateFactoryクラスでは、FactoryMethodパターンを利用して、ConcreateProductを生成する。<br>


4. サンプルコードの解説<br>

   a. AbstractProduct<br>
        抽象的な部品。<br>
        このクラスで部品のインターフェースを定義しておく。<br>
        今回の実装では、OsFileSystemがこれに該当する。<br>

    b. ConcreateFactory<br>
        具体的な工場。<br>
        このクラスから、具体的な部品（ConcreateProduct）を生成する。<br>
        今回の実装では、WindowsFactory、LinuxFactoryクラスがこれに該当する。<br>

    c. ConcreateProduct<br>
        具体的な部品で、このクラス内で処理を実装する。<br>
        今回の実装では、WindowsDisplaySystem、WindowsFileSystem、LinuxDisplaySystem、LinuxFileSystemクラスがこれに該当する。<br>
        - ファイルセパレータ（/や¥）の取得
        - ルートパスの取得
        - ファイルの保存

    d. WindowsFactory<br>
        Windows用システムの工場。<br>
        Windows用のディスプレイシステム、ファイルシステムのインスタンスを生成するメソッドを実装する。<br>

    e. WindowsDisplaySystem<br>
         Windows用のディスプレイシステム。<br>
         OsDisplaySystemクラスの中小メソッドを実装する。<br> 

    f. WindowsFileSystem<br>
        Windows用のファイルシステム。<br>
        OsFileSystemクラスの抽象メソッドを実装する。<br>

    g. LinuxFactory<br>
        Linux用システムの工場。<br>
        Linux用ディスプレイシステム、ファイルシステムのインスタンスを生成するメソッドを実装する。<br>

    h. LinuxDisplaySystem<br>
        Linux用のディスプレイシステム。<br>
        OsDisplay Systemクラスの抽象メソッドを実装する。<br>
        
    i. LinuxFileSystem<br>
        Linux用ファイルシステム。<br>
        OsFileSystemクラスの抽象メソッドを実装する。<br>

5. まとめ<br>

   - 複数のサブクラス群をまとめて変更したい場合、AbstractFactoryパターンを利用する。
   - Factoryクラス、Productクラスを抽象化する（インターフェースは決めておく）。
   - Factorクラスに、Factoryのサブクラスのインスタンスを生成するstatic、メソッドを用意する。

