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
          <div class="panel-footer">
          </div>
      </div>
  </div>
</div>
  """



Tags = (a) ->
  $.get "/hashtag/" + a, (messages) ->
    $.each messages, (index, message) ->
      $("#messages").append myHtml index, message.tweet


$ ->
  tagd = $("#tagger").attr("querytag")
  console.log tagd
  Tags tagd
