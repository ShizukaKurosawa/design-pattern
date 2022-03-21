### Bridgeパターン

1. サンプルコードの解説<br>
  - DbImpl<br>
    実装の抽象クラス。<br>
    DBに接続したりするメソッドを定義しておく。<br>
    Implとは、Implementation（実装）の略である。<br>

  - MysqlDbImpl<br>
    具体的な実装クラス。<br>
    ここに具体的な処理を書いていく。<br>
    今回は、MySQLに接続すると仮定したクラスを作成する。<br>

  - PostgreDbImpl<br>
    具体的な実装のクラスで、PostgresSQLに接続しすると仮定したクラスを作成する。<br>

  - Display<br>
    機能のクラス。<br>
    このクラスで提供しているサービス（機能）は、全従業員の一覧を取得と表示することである。<br>

  - CustomDisplay<br>
    機能を拡張したクラス。<br>
    このクラスでは、指定年齢以下の従業員を表示する機能を追加する。<br>


2. Bridgeパターンでは、以下クラスを作成する。

  - Abstraction<br>
    機能のインターフェースを定義する。<br>
    Implementor型のフィールドを持つ。<br>
    今回は、Displayクラスがこれに該当する。<br>

  - Refined Abstraction<br>
    機能を拡張するクラス。<br>
    今回は、CustomDisplayクラスがこれに該当する。<br>

  - Implimentor<br>
    実装を行うクラスのインターフェースを定義する。<br>
    今回は、DbImplクラスがこれに該当する。<br>

  - ConcreateImplementor<br>
    具体的な実装を行う。<br>
    今回は、MysqlDbImpl、PostgreDbImplクラスがこれに該当する。<br>


3. 利用シーン・メソッド<br>

Bridgeパターンは、以下のような場合に利用する。<br>
  
  - 機能と実装の結合を緩やかにしたい場合<br>
    例えば、環境（プラットフォームやDB）に合わせて実装のクラスを変更・選択したしたい場合がある。<br>

  - 機能と実装をそれぞれ拡張可能にする場合<br>
    機能（サービス）の拡張や環境の追加がある場合、Bredgeパターンを適用することで、拡張が容易になる。<br>


4. 注意点・問題点<br>

  Bredgeパターンを作る上の注意点は、きちんとルールを守ることである。<br>
  機能の階層には機能のみを、実装の階層には実装のみを書くことである。<br>

  具体的には、機能の階層に実装を書くことも可能である。<br>
  ちょっとしたメソッドを作成する場合であれば、わざわざ実装の階層を修正しなくても、機能の方に追加指定まえば良い、となってしまう場合もある。<br>
  ※Bridgeパターンに限らない話<br>
  1度でもこのようなことをしてしまうと、どんどんルールを守らなくなってしまい、もはやBridgeパターンとは程遠いクラス等になってしまう。<br>


5. 他のパターンとの関連<br>

  - Abstract Factoryパターン<br>
    環境（プラットフォームやDB）などに合わせて、ConcreteImplementorを生成する場合がある。<br>
    そのため、Abstract Factoryパターンが利用されることがある。<br>

  - Adapterパターン<br>
    Adapterパターンは、インターフェースが異なるクラス同士を結合させる。<br>
    バージョンアップの際に利用されることが多いため、通常は設計後に適用される。<br>
    一方、Bredgeパターンは機能と実装を独立させて変更できるようにする。<br>
    そのため、設計段階で適用される。<br>


6. まとめ<br>

  - 機能と実装の階層を分けることで、それぞれ独立して変更することができるようになる。<br>
  - 機能のクラスに実装クラスのフィールドを持つことで箸渡すをする。<br>

