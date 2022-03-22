### Compositeパターン

オブジェクトを木構造で表現し、再起的な処理を行う。<br>

1. 利用シーン・メリット<br>

  木構造を持つオブジェクトを表現したい場合、またはそれらに再起的な処理を行いたい場合に利用する。<br>


2. サンプルコードの解説<br>

  - Unit<br>
    部署とその配下にあるグループを同一視するための抽象クラス。<br>

  - Department<br>
    部署を表す。<br>

  - Group<br>
    課（グループ）を表す。<br>

  - Main<br>
    Unitクラスに対する操作をする。<br>

  Compositeパターンでは、以下クラスを作成する。<br>

  - Component<br>
    LeafとCompositeを一緒に扱うためのクラス。<br>
    今回は、Unitクラスがこれに該当する。<br>
    このクラスでは、Compositeクラスで扱うメソッドを定義しておく。<br>

  - Leaf<br>
    末端を表すクラス。<br>
    末端のため、子クラスとなるオブジェクトは持たない。
    今回は、Groupクラスがこれに該当する。<br>

  - Composite<br>
    親オブジェクトを表すクラス。<br>
    フィールドに子を持つ。<br>
    今回は、Departmentクラスがこれに該当する。<br>

  - Cilent<br>
    Componentに対して操作を持つ。<br>
    今回は、Mainクラスがこれに該当する。<br>

3. 他のパターンとの関連<br>

  - Decoratorパターン<br>
    Compositeパターンは、親と子を同一視する。<br>
    Decoratorパターンは、装飾と中身を同一視する。<br>

  - Visitorパターン<br>
    Visitorパターンでは、Compositeを一つ一つ訪問して、処理をする。<br>

  - Commandパターン<br>
    Commandパターンでは、マクロコマンドを作成する際に、Compositeパターンが利用される。<br>

  - Iteratorパターン<br>
    Componentの走査（スキャン）のために利用されることがある。<br>

4. まとめ<br>

  - Compositeパターンでは、親とこを同じものとみなすことで、再起的な処理を行う。<br>

  - 親と子を同じものとみなすための抽象クラス、またはインターフェースを等位する。<br>

