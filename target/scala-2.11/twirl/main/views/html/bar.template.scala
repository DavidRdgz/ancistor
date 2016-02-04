
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object bar_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class bar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),format.raw/*3.1*/("""<div class="center-block col-md-6" style="float: none">
  <form action=""""),_display_(/*4.18*/routes/*4.24*/.Application.addMessage()),format.raw/*4.49*/("""" method="post">
    <div class="input-group">
      <input name="tweet" type="text" class="form-control input-lg" id="inputlg">
      <span class="btn input-group-addon input-lg">
        <i class="glyphicon glyphicon-inbox"></i>
      </span>
    </div>
  </form>
</div>

"""),_display_(/*14.2*/content),format.raw/*14.9*/("""

"""))
      }
    }
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply()(content)

  def f:(() => (Html) => play.twirl.api.HtmlFormat.Appendable) = () => (content) => apply()(content)

  def ref: this.type = this

}


}

/**/
object bar extends bar_Scope0.bar
              /*
                  -- GENERATED --
                  DATE: Fri Jan 29 15:54:08 PST 2016
                  SOURCE: /Users/galois/Desktop/activator-1.3.7-minimal/play-scala-portfolio/app/views/bar.scala.html
                  HASH: dc8d1a53068875257266974982fdc8a92e9d58e4
                  MATRIX: 521->1|633->18|661->20|760->93|774->99|819->124|1120->399|1147->406
                  LINES: 20->1|25->1|27->3|28->4|28->4|28->4|38->14|38->14
                  -- GENERATED --
              */
          