extends Node

#class_name OneSignal , "res://onesignal-plugin-api/onesignal.png"


export var app_key : String = "40afa071-cd30-48dd-a928-f579bb01b975"
export var is_debug : bool = false

var _onesignal : Object

func _enter_tree() -> void:
	if Engine.has_singleton("GodotOneSignal"):
		_onesignal = Engine.get_singleton("GodotOneSignal")
	else:
		printerr("GodotOneSignal Plugin not found, Android Only")


# Initialize OneSignal and log the device
# set is debug to tru to log errors 
func initialize():
	if _onesignal != null:
		_onesignal.initialize(app_key,is_debug)
