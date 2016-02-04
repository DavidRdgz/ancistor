
myHtml2 = (tweet) ->
  """
  <hr class="divider">
  <div style="float: none ;padding-left: 15px;padding-top: 5px;padding-bottom: 5px">
  #{tweet}
  </div>
  """

myHtml = (index, tweet) ->
  """
  <div class="panel-group" id="accordion">
    <div class="panel panel-default">
       <div class="panel-header">
             <div class="panel-body"
                 data-toggle="collapse"
                 data-target="#collapse#{index}">
                 #{tweet}
             </div>
        </div>
        <div id="collapse#{index}"
             class="panel-collapse collapse">
        </div>
    </div>
  </div>
  """


$ ->
  $.get "/messages", (messages) ->
    $.each messages, (idx, msg) ->
      $("#messages").append myHtml idx, msg.tweet
      for x in msg.otags
        $("#collapse#{idx}").append myHtml2 x
