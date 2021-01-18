Main -> SimpleGraphEditor.java

java -jar plantuml-dependency-cli-1.4.0-jar-with-dependencies.jar -o src/main/java/Framework/Graphed2/README-generated.puml -b . -i **/Graphed2/**/*.java  -v

todo: test
```plantuml
@startuml
package Framework.Graphed2 <<Frame>> {
    abstract AbstractEdge
    abstract Graph
    
    class GraphFrame
    class GraphPanel
    class JFrame
    class JPanel
    class LineStyle
    class LineStyleEditor
    interface Edge{
        +draw(g2: Graphics2D )
        +contains(aPoint: Point2D ) : boolean
        +connect(aStart : Node, anEnd : Node)
        +getStart() : Node
        +getEnd() : Node
        +getConnectionPoints() : Line2D
        +getBounds(g2 : Graphics2D)
        +clone() : Object
    }
    class PropertyEditorSupport
    class PropertySheet
    class SimpleGraph
    class SimpleGraphEditor
    class ToolBar
    interface LayoutManager{
        +addLayoutComponent(name String, comp Component)
        +removeLayoutComponent(comp Component)
        +preferredLayoutSize(parent, Container) :Dimension
        +minimumLayoutSize(parent Container) : Dimension
        +layoutContainer(parent Container)
    } 
    interface Node{
        +draw(g2 : Graphics2D )
        +translate(dx :double , dy : double )
        +contains(aPoint : Point2D )
        +getConnectionPoint(aPoint :Point2D  )
        +getBounds()
        +clone() : Object 
    }
}



package LayoutManagers <<Folder>> { 
    class FormLayout
}

package Edges <<Folder>> { 
    class LineEdge
}

package Nodes <<Folder>> {
    class CircleNode
    class PointNode
}







FormLayout .left.|> LayoutManager

AbstractEdge ..|> Edge
CircleNode ..|> Node
SimpleGraphEditor --> JFrame
GraphFrame --|> JFrame
GraphPanel --|> JPanel
LineEdge --|> AbstractEdge
LineStyleEditor --|> PropertyEditorSupport
PointNode ..|> Node

PropertySheet --|> JPanel
SimpleGraph -up-|> Graph

ToolBar --|> JPanel
@enduml
```